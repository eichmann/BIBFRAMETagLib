package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicAccessibilityFeature extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicAccessibilityFeature currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicAccessibilityFeature.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicAccessibilityFeatureIterator theElectronic = (ElectronicAccessibilityFeatureIterator)findAncestorWithClass(this, ElectronicAccessibilityFeatureIterator.class);
			pageContext.getOut().print(theElectronic.getAccessibilityFeature());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for accessibilityFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for accessibilityFeature tag ");
		}
		return SKIP_BODY;
	}
}

