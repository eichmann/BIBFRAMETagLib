package edu.uiowa.slis.BIBFRAME.Isbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsbnLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsbnLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IsbnLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isbn theIsbn = (Isbn)findAncestorWithClass(this, Isbn.class);
			if (!theIsbn.commitNeeded) {
				pageContext.getOut().print(theIsbn.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Isbn theIsbn = (Isbn)findAncestorWithClass(this, Isbn.class);
			return theIsbn.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isbn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Isbn theIsbn = (Isbn)findAncestorWithClass(this, Isbn.class);
			theIsbn.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for label tag ");
		}
	}
}

