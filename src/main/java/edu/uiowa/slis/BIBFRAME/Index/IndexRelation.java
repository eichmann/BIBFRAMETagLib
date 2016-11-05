package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexRelationIterator theIndexRelationIterator = (IndexRelationIterator)findAncestorWithClass(this, IndexRelationIterator.class);
			pageContext.getOut().print(theIndexRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for relation tag ");
		}
		return SKIP_BODY;
	}
}

