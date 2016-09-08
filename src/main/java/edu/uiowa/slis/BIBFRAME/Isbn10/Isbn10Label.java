package edu.uiowa.slis.BIBFRAME.Isbn10;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Isbn10Label extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Isbn10Label currentInstance = null;
	private static final Log log = LogFactory.getLog(Isbn10Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isbn10 theIsbn10 = (Isbn10)findAncestorWithClass(this, Isbn10.class);
			if (!theIsbn10.commitNeeded) {
				pageContext.getOut().print(theIsbn10.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn10 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn10 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Isbn10 theIsbn10 = (Isbn10)findAncestorWithClass(this, Isbn10.class);
			return theIsbn10.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isbn10 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn10 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Isbn10 theIsbn10 = (Isbn10)findAncestorWithClass(this, Isbn10.class);
			theIsbn10.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn10 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn10 for label tag ");
		}
	}
}

