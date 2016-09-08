package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileAccessibilityFeature extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileAccessibilityFeature currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileAccessibilityFeature.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileAccessibilityFeatureIterator theTactile = (TactileAccessibilityFeatureIterator)findAncestorWithClass(this, TactileAccessibilityFeatureIterator.class);
			pageContext.getOut().print(theTactile.getAccessibilityFeature());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for accessibilityFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for accessibilityFeature tag ");
		}
		return SKIP_BODY;
	}
}

