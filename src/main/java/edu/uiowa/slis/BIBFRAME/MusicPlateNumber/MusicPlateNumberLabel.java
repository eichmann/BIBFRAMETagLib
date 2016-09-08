package edu.uiowa.slis.BIBFRAME.MusicPlateNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPlateNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPlateNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPlateNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MusicPlateNumber theMusicPlateNumber = (MusicPlateNumber)findAncestorWithClass(this, MusicPlateNumber.class);
			if (!theMusicPlateNumber.commitNeeded) {
				pageContext.getOut().print(theMusicPlateNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPlateNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MusicPlateNumber theMusicPlateNumber = (MusicPlateNumber)findAncestorWithClass(this, MusicPlateNumber.class);
			return theMusicPlateNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MusicPlateNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MusicPlateNumber theMusicPlateNumber = (MusicPlateNumber)findAncestorWithClass(this, MusicPlateNumber.class);
			theMusicPlateNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPlateNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for label tag ");
		}
	}
}

