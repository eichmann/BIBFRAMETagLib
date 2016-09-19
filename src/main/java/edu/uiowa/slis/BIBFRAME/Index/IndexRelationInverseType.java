package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexRelationInverseIterator theIndexRelationInverseIterator = (IndexRelationInverseIterator)findAncestorWithClass(this, IndexRelationInverseIterator.class);
			pageContext.getOut().print(theIndexRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for relation tag ");
		}
		return SKIP_BODY;
	}
}

