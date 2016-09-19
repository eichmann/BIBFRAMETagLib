package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(TextDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextDerivedFromIterator theTextDerivedFromIterator = (TextDerivedFromIterator)findAncestorWithClass(this, TextDerivedFromIterator.class);
			pageContext.getOut().print(theTextDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

