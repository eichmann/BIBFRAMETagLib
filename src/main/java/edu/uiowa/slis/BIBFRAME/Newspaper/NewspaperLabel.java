package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Newspaper theNewspaper = (Newspaper)findAncestorWithClass(this, Newspaper.class);
			if (!theNewspaper.commitNeeded) {
				pageContext.getOut().print(theNewspaper.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Newspaper theNewspaper = (Newspaper)findAncestorWithClass(this, Newspaper.class);
			return theNewspaper.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Newspaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Newspaper theNewspaper = (Newspaper)findAncestorWithClass(this, Newspaper.class);
			theNewspaper.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for label tag ");
		}
	}
}

