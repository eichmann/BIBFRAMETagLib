package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextAccompaniedByIterator theTextAccompaniedByIterator = (TextAccompaniedByIterator)findAncestorWithClass(this, TextAccompaniedByIterator.class);
			pageContext.getOut().print(theTextAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

