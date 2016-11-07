package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRelationIterator theNewspaperRelationIterator = (NewspaperRelationIterator)findAncestorWithClass(this, NewspaperRelationIterator.class);
			pageContext.getOut().print(theNewspaperRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for relation tag ");
		}
		return SKIP_BODY;
	}
}
