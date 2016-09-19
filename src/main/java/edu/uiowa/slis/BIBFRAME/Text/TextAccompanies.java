package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(TextAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextAccompaniesIterator theTextAccompaniesIterator = (TextAccompaniesIterator)findAncestorWithClass(this, TextAccompaniesIterator.class);
			pageContext.getOut().print(theTextAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

