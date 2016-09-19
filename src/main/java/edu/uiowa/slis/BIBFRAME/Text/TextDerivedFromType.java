package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextDerivedFromIterator theTextDerivedFromIterator = (TextDerivedFromIterator)findAncestorWithClass(this, TextDerivedFromIterator.class);
			pageContext.getOut().print(theTextDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

