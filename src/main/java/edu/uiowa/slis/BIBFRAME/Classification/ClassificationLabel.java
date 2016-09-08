package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Classification theClassification = (Classification)findAncestorWithClass(this, Classification.class);
			if (!theClassification.commitNeeded) {
				pageContext.getOut().print(theClassification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Classification theClassification = (Classification)findAncestorWithClass(this, Classification.class);
			return theClassification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Classification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Classification theClassification = (Classification)findAncestorWithClass(this, Classification.class);
			theClassification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for label tag ");
		}
	}
}

