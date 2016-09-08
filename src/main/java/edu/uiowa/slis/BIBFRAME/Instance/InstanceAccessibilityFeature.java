package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceAccessibilityFeature extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceAccessibilityFeature currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceAccessibilityFeature.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceAccessibilityFeatureIterator theInstance = (InstanceAccessibilityFeatureIterator)findAncestorWithClass(this, InstanceAccessibilityFeatureIterator.class);
			pageContext.getOut().print(theInstance.getAccessibilityFeature());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for accessibilityFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for accessibilityFeature tag ");
		}
		return SKIP_BODY;
	}
}

