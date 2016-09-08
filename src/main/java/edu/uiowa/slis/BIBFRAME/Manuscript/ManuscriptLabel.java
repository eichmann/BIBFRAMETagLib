package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Manuscript theManuscript = (Manuscript)findAncestorWithClass(this, Manuscript.class);
			if (!theManuscript.commitNeeded) {
				pageContext.getOut().print(theManuscript.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Manuscript theManuscript = (Manuscript)findAncestorWithClass(this, Manuscript.class);
			return theManuscript.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Manuscript for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Manuscript theManuscript = (Manuscript)findAncestorWithClass(this, Manuscript.class);
			theManuscript.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for label tag ");
		}
	}
}

