package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionCreatedForDegreeIterator theCollectionCreatedForDegreeIterator = (CollectionCreatedForDegreeIterator)findAncestorWithClass(this, CollectionCreatedForDegreeIterator.class);
			pageContext.getOut().print(theCollectionCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

