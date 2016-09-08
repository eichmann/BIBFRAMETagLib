package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NlmClassification theNlmClassification = (NlmClassification)findAncestorWithClass(this, NlmClassification.class);
			if (!theNlmClassification.commitNeeded) {
				pageContext.getOut().print(theNlmClassification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NlmClassification theNlmClassification = (NlmClassification)findAncestorWithClass(this, NlmClassification.class);
			return theNlmClassification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NlmClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NlmClassification theNlmClassification = (NlmClassification)findAncestorWithClass(this, NlmClassification.class);
			theNlmClassification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for label tag ");
		}
	}
}

