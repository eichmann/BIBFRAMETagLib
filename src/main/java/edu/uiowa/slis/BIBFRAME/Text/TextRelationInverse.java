package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TextRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextRelationInverseIterator theTextRelationInverseIterator = (TextRelationInverseIterator)findAncestorWithClass(this, TextRelationInverseIterator.class);
			pageContext.getOut().print(theTextRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for relation tag ");
		}
		return SKIP_BODY;
	}
}

