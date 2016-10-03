package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionMemberInverseIterator theCollectionMemberInverseIterator = (CollectionMemberInverseIterator)findAncestorWithClass(this, CollectionMemberInverseIterator.class);
			pageContext.getOut().print(theCollectionMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for member tag ");
		}
		return SKIP_BODY;
	}
}

