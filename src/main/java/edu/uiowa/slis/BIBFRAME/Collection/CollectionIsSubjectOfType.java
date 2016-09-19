package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsSubjectOfIterator theCollectionIsSubjectOfIterator = (CollectionIsSubjectOfIterator)findAncestorWithClass(this, CollectionIsSubjectOfIterator.class);
			pageContext.getOut().print(theCollectionIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

