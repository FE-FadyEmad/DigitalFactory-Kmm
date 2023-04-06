import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel

    var body: some View {
        Text(viewModel.text)
    }
    
    class ViewModel: ObservableObject {
        @Published var text = "Loading..."
        var useCase = UseCase()
        init() {
            useCase.invoke { result, error in
                DispatchQueue.main.async {
                    if let result = result {
                        self.text = result
                    } else {
                        self.text = error?.localizedDescription ?? "error"
                    }
                }
            }
        }
    }
}
