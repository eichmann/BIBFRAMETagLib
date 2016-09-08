package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LccClassification theLccClassification = (LccClassification)findAncestorWithClass(this, LccClassification.class);
			if (!theLccClassification.commitNeeded) {
				pageContext.getOut().print(theLccClassification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LccClassification theLccClassification = (LccClassification)findAncestorWithClass(this, LccClassification.class);
			return theLccClassification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LccClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LccClassification theLccClassification = (LccClassification)findAncestorWithClass(this, LccClassification.class);
			theLccClassification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for label tag ");
		}
	}
}

