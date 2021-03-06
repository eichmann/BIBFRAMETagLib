package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSubjectIterator theCollectionSubjectIterator = (CollectionSubjectIterator)findAncestorWithClass(this, CollectionSubjectIterator.class);
			pageContext.getOut().print(theCollectionSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for subject tag ");
		}
		return SKIP_BODY;
	}
}

