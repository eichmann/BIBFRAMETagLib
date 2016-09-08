package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintAccessibilityFeature extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintAccessibilityFeature currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintAccessibilityFeature.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintAccessibilityFeatureIterator thePrint = (PrintAccessibilityFeatureIterator)findAncestorWithClass(this, PrintAccessibilityFeatureIterator.class);
			pageContext.getOut().print(thePrint.getAccessibilityFeature());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for accessibilityFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for accessibilityFeature tag ");
		}
		return SKIP_BODY;
	}
}

