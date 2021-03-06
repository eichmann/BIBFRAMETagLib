package edu.uiowa.slis.BIBFRAME.Doi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DoiLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DoiLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DoiLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Doi theDoi = (Doi)findAncestorWithClass(this, Doi.class);
			if (!theDoi.commitNeeded) {
				pageContext.getOut().print(theDoi.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Doi for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Doi theDoi = (Doi)findAncestorWithClass(this, Doi.class);
			return theDoi.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Doi for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Doi theDoi = (Doi)findAncestorWithClass(this, Doi.class);
			theDoi.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Doi for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for label tag ");
		}
	}
}

