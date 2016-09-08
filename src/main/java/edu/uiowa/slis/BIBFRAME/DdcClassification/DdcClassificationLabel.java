package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DdcClassification theDdcClassification = (DdcClassification)findAncestorWithClass(this, DdcClassification.class);
			if (!theDdcClassification.commitNeeded) {
				pageContext.getOut().print(theDdcClassification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DdcClassification theDdcClassification = (DdcClassification)findAncestorWithClass(this, DdcClassification.class);
			return theDdcClassification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DdcClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DdcClassification theDdcClassification = (DdcClassification)findAncestorWithClass(this, DdcClassification.class);
			theDdcClassification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for label tag ");
		}
	}
}

