package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(TextRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextRelationIterator theTextRelationIterator = (TextRelationIterator)findAncestorWithClass(this, TextRelationIterator.class);
			pageContext.getOut().print(theTextRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for relation tag ");
		}
		return SKIP_BODY;
	}
}

